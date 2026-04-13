# 1.Importación de dependencias y lectura de datos
if (!require(readxl)) install.packages("readxl")
library(readxl)

archivo <- file.choose()
datos <- read_excel(archivo)

# 2. Frecuencias para Plataforma_Trabajo (Variable Nominal)
freq_abs_plat <- table(datos$Plataforma_Trabajo)
freq_rel_plat <- prop.table(freq_abs_plat)

tabla_plataforma <- cbind(Frecuencia_Absoluta = freq_abs_plat, 
                          Frecuencia_Relativa = freq_rel_plat)

# 3. Frecuencias para Tickets_Soporte (Variable Discreta)
freq_abs_tick <- table(datos$Tickets_Soporte)
freq_rel_tick <- prop.table(freq_abs_tick)

tabla_tickets <- cbind(Frecuencia_Absoluta = freq_abs_tick, 
                       Frecuencia_Relativa = freq_rel_tick, 
                       Frecuencia_Acumulada = cumsum(freq_abs_tick),
                       Frecuencia_Rel_Acumulada = cumsum(freq_rel_tick))

# 4. Frecuencias para Tiempo_Conexion (Variable Continua)
# Agrupación mediante la Regla de Sturges
k <- round(1 + 3.322 * log10(nrow(datos)))
tiempo_agrupado <- cut(datos$Tiempo_Conexion, breaks = k)

freq_abs_tiempo <- table(tiempo_agrupado)
freq_rel_tiempo <- prop.table(freq_abs_tiempo)

tabla_tiempo <- cbind(Frecuencia_Absoluta = freq_abs_tiempo, 
                      Frecuencia_Relativa = freq_rel_tiempo, 
                      Frecuencia_Acumulada = cumsum(freq_abs_tiempo),
                      Frecuencia_Rel_Acumulada = cumsum(freq_rel_tiempo))

# Impresión de resultados
print("--- Plataforma de Trabajo ---")
print(tabla_plataforma)

print("--- Tickets de Soporte ---")
print(tabla_tickets)

print("--- Tiempo de Conexión ---")
print(tabla_tiempo)