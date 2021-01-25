package com.example.region.file_upload;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface Api {
    @Multipart
    @Headers("secretkey: uMJYQrh,n?QD?>C&~Ok:+d:Mj&P3Mj")
    @POST("saveUpload")
    //Call<ResponsePOJO> uploadImage(@Part("type") String type, @Part("user_id") String user_id, @Part String file);
   Call<ResponsePOJO> uploadImage(
            @Part("user_id") String user_id,
            @Part("type") String type,
            @Part("file") String file
    );

    /*Call<ResponsePOJO> uploadImage(@Part("user_id") String user_id,
                                           @Part("type") String type,
                                           @Part String file);*/
}
