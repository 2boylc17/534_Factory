object MetricImperialFactory {
    fun getConverter(targetLanguage: String) : Converter? {
        return when (targetLanguage) {
                "feetToMetres" -> DistanceConverter()

                "celsiusToFahrenheit" -> TemperatureConverter()
            else -> null
        }
    }
}