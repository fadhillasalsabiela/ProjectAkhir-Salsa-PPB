package com.example.info_perndakian

import com.google.gson.annotations.SerializedName

data class ResponseLuarSumatera(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null
)

data class DataItem1(

	@field:SerializedName("nama_gunung")
	val namaGunung: String? = null,

	@field:SerializedName("id_kategori")
	val idKategori: Int? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("imgmaps")
	val imgmaps: Any? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("deskripsi")
	val deskripsi: String? = null,

	@field:SerializedName("gambar")
	val gambar: Any? = null
)
