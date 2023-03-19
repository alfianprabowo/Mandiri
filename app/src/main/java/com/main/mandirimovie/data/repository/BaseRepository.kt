package com.main.mandirimovie.data.repository
import androidx.lifecycle.MutableLiveData
import com.main.mandirimovie.data.model.network.BaseListResponse
import com.main.mandirimovie.data.model.network.BasePageListResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Call
import com.main.mandirimovie.util.extension.onException
import com.main.mandirimovie.util.extension.onFailure
import com.main.mandirimovie.util.extension.onSuccess


abstract class BaseRepository {
    protected suspend fun <Type> loadCall(
        call: () -> Call<Type>,
        result: MutableLiveData<Type>,
        errorText: (String) -> Unit
    ) =
        withContext(Dispatchers.IO) {
//            call().request { response ->
//                response.onSuccess { data?.let { result.postValue(it) } }
//                response.onException { message?.let { errorText(it) } }
//                response.onFailure { message?.let { errorText(it) } }
//            }
            call().request()

            result.apply { postValue(null) }
        }

    protected suspend fun <Response : BaseListResponse<ListType>, ListType> loadListCall(
        call: () -> Call<Response>,
        result: MutableLiveData<List<ListType>>,
        errorText: (String) -> Unit
    ) =
        withContext(Dispatchers.IO) {
//            call().request ( response ->
//                response.onSuccess { data?.let { result.postValue((it).results) } }
//                response.onException { message?.let { errorText(it) } }
//                response.onFailure { message?.let { errorText(it) } }
//            )
            call().request()
            result.apply { postValue(null) }
        }

    protected suspend fun <Response : BasePageListResponse<ListType>, ListType> loadPageListCall(
        call: () -> Call<Response>,
        result: MutableLiveData<List<ListType>>,
        errorText: (String) -> Unit
    ) =
        withContext(Dispatchers.IO) {
//            call().request { response ->
//                response.onSuccess { data?.let { result.postValue((it).results) } }
//                response.onException { message?.let { errorText(it) } }
//                response.onFailure { message?.let { errorText(it) } }
//            }
            call().request()

            result.apply { postValue(null) }
        }
}