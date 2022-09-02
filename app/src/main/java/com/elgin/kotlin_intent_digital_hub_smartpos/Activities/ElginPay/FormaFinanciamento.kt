package com.elgin.kotlin_intent_digital_hub_smartpos.Activities.ElginPay

enum class FormaFinanciamento  {
    FINANCIAMENTO_A_VISTA, FINANCIAMENTO_PARCELADO_EMISSOR, FINANCIAMENTO_PARCELADO_ESTABELECIMENTO;


    open fun getCodigoFormaParcelamento(): Int {
        return ordinal
    }
}