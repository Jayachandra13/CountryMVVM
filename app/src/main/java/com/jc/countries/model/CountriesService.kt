package com.jc.countries.model

import com.jc.countries.di.DaggerApiComponent
import io.reactivex.Single
import javax.inject.Inject


class CountriesService {
    @Inject
    lateinit var api: CountriesAPI

    init {
        DaggerApiComponent.create().inject(this)
    }

    fun getCountriesList(): Single<List<Country>> {
        return api.getCountries()
    }
}