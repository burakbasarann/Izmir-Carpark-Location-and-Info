package com.otopark.izmir_otopark_lokasyon.model


import com.google.gson.annotations.SerializedName

class CarParkListResponse : ArrayList<CarParkListResponse.CarParkListResponseItem>(){
    data class CarParkListResponseItem(
        @SerializedName("accessibility")
        var accessibility: Accessibility? = null,
        @SerializedName("accessories")
        var accessories: Accessories? = null,
        @SerializedName("address")
        var address: String? = null,
        @SerializedName("entrances")
        var entrances: List<Any?>? = null,
        @SerializedName("exits")
        var exits: List<Any?>? = null,
        @SerializedName("isPaid")
        var isPaid: Boolean? = null,
        @SerializedName("lat")
        var lat: Double? = null,
        @SerializedName("lng")
        var lng: Double? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("nonstop")
        var nonstop: Boolean? = null,
        @SerializedName("occupancy")
        var occupancy: Occupancy? = null,
        @SerializedName("openingHours")
        var openingHours: OpeningHours? = null,
        @SerializedName("payment")
        var payment: Payment? = null,
        @SerializedName("poi")
        var poi: Poi? = null,
        @SerializedName("provider")
        var provider: String? = null,
        @SerializedName("status")
        var status: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("ufid")
        var ufid: String? = null
    ) {
        data class Accessibility(
            @SerializedName("disabled")
            var disabled: Boolean? = null,
            @SerializedName("lpgAllowed")
            var lpgAllowed: Boolean? = null,
            @SerializedName("maxHeight")
            var maxHeight: Int? = null,
            @SerializedName("maxLength")
            var maxLength: Int? = null,
            @SerializedName("maxWidth")
            var maxWidth: Double? = null
        )
    
        data class Accessories(
            @SerializedName("barrier")
            var barrier: Boolean? = null,
            @SerializedName("cctv")
            var cctv: Boolean? = null,
            @SerializedName("covered")
            var covered: Boolean? = null
        )
    
        data class Occupancy(
            @SerializedName("total")
            var total: Total? = null
        ) {
            data class Total(
                @SerializedName("free")
                var free: Int? = null,
                @SerializedName("occupied")
                var occupied: Int? = null
            )
        }
    
        data class OpeningHours(
            @SerializedName("friday")
            var friday: String? = null,
            @SerializedName("monday")
            var monday: String? = null,
            @SerializedName("saturday")
            var saturday: String? = null,
            @SerializedName("sunday")
            var sunday: String? = null,
            @SerializedName("thursday")
            var thursday: String? = null,
            @SerializedName("tuesday")
            var tuesday: String? = null,
            @SerializedName("wednesday")
            var wednesday: String? = null
        )
    
        data class Payment(
            @SerializedName("card")
            var card: Boolean? = null,
            @SerializedName("cash")
            var cash: Boolean? = null,
            @SerializedName("sms")
            var sms: Boolean? = null
        )
    
        data class Poi(
            @SerializedName("busStation")
            var busStation: Boolean? = null,
            @SerializedName("metroStation")
            var metroStation: Boolean? = null,
            @SerializedName("trainStation")
            var trainStation: Boolean? = null,
            @SerializedName("tramStation")
            var tramStation: Boolean? = null
        )
    }
}