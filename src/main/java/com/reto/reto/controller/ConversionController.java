package com.reto.reto.controller;

import com.reto.reto.model.ConversionRequest;
import com.reto.reto.model.ConversionResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/conversion")
public class ConversionController {

    private static final double TIPO_CAMBIO_EURO_A_SOLES = 4.0;

    @PostMapping
    public Mono<ConversionResponse> convertirMoneda(@RequestBody ConversionRequest request) {
        double monto = request.getMonto();
        String monedaOrigen = request.getMonedaOrigen();
        String monedaDestino = request.getMonedaDestino();
        double tipoCambio = obtenerTipoCambio(monedaOrigen, monedaDestino);

        double montoConvertido = monto * tipoCambio;

        ConversionResponse response = new ConversionResponse(
                monto,
                montoConvertido,
                monedaOrigen,
                monedaDestino,
                tipoCambio
        );

        return Mono.just(response);
    }

    private double obtenerTipoCambio(String monedaOrigen, String monedaDestino) {
        // Implementa la lógica para obtener el tipo de cambio según tus necesidades
        // En este ejemplo, solo se proporciona un tipo de cambio fijo de Euro a Soles
        if ("EUR".equals(monedaOrigen) && "PEN".equals(monedaDestino)) {
            return 4;
        } else if ("PEN".equals(monedaOrigen) && "EUR".equals(monedaDestino)) {
            return 1; // Tipo de cambio inverso
        } else {
            // Manejar otros casos según tus necesidades
            throw new IllegalArgumentException("Tipo de cambio no admitido para las monedas proporcionadas");
        }
    }
}
