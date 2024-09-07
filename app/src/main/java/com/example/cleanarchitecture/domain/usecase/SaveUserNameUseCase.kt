package com.example.cleanarchitecture.domain.usecase

import com.example.cleanarchitecture.domain.models.SaveUserNameParam

class SaveUserNameUseCase {

    fun execute(param: SaveUserNameParam) : Boolean {
        return param.name.isNotEmpty()
    }
}