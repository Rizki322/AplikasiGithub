package com.example.aplikasigithub

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class GithubUser (
    @SerializedName("login")
    val login:String,

    @SerializedName("id")
    val id:Int,

     @SerializedName("node_id")
    val nodeId:String,

     @SerializedName("avatar_url")
    val avatarUrl:String,

    @SerializedName("gravatar_id")
    val gravatarId:String,

    @SerializedName("url")
    val htmUrl:String,

    @SerializedName("followers_url")
    val followersUrl:String,

    @SerializedName("gists_url")
    val gistsUrl:String,

    @SerializedName("starred_url")
    val starredUrl:String,

    @SerializedName("subcriptions_url")
    val subcriptionsUrl:String,

    @SerializedName("organizations_url")
    val organizations:String,

    @SerializedName("repos_url")
    val reposUrl:String,

    @SerializedName("events_url")
    val eventsUrl:String,

    @SerializedName("received_events_url")
    val receivedEventsUrl:String,

    @SerializedName("type")
    val type:String,

    @SerializedName("site_admin")
    val siteAdmin:Boolean

) : Serializable