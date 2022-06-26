package com.windrialfika.winewsmandiri.Support.Network.Repo

interface MainRepoCallback<T> {
        fun onDataLoad(data: T)
        fun onError(error: Throwable)
}