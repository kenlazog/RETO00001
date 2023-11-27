package com.reto.reto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ConversionResponse {
    private double montoOriginal;
    private double montoConvertido;
    private String monedaOrigen;
    private String monedaDestino;
    private double tipoCambio;

    public ConversionResponse() {
    }


    public ConversionResponse(double montoOriginal, double montoConvertido, String monedaOrigen, String monedaDestino, double tipoCambio) {
        this.montoOriginal = montoOriginal;
        this.montoConvertido = montoConvertido;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.tipoCambio = tipoCambio;
    }

    public double getMontoOriginal() {
        return montoOriginal;
    }

    public void setMontoOriginal(double montoOriginal) {
        this.montoOriginal = montoOriginal;
    }

    public double getMontoConvertido() {
        return montoConvertido;
    }

    public void setMontoConvertido(double montoConvertido) {
        this.montoConvertido = montoConvertido;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
}