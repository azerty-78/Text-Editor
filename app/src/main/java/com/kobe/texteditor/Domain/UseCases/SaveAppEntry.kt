package com.kobe.texteditor.Domain.UseCases

import com.kobe.texteditor.Domain.Manager.LocalUserManager

class SaveAppEntry (
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}