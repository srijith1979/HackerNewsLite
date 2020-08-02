package com.androideveloper.hackernewsfeed.play.repository

import com.androideveloper.hackernewsfeed.play.api.RetrofitInstance
import com.androideveloper.hackernewsfeed.play.db.HackerStoryDatabase
import com.androideveloper.hackernewsfeed.play.model.HackerStory

class HackerFeedRepository(val db: HackerStoryDatabase) {
    suspend fun getTopStories() = RetrofitInstance.api.getTopStories()

    suspend fun getNewStories() = RetrofitInstance.api.getNewStories()

    suspend fun getJobStories() = RetrofitInstance.api.getJobStories()

    suspend fun fetchStoryById(id: Int) = RetrofitInstance.api.getStoryById(id)

    suspend fun upsert(hackerStory: HackerStory) = db.getHackerStoryDao().upsert(hackerStory)

    fun getAllSavedNews() = db.getHackerStoryDao().getAllSavedStories()

    suspend fun delete(hackerStory: HackerStory) = db.getHackerStoryDao().delete(hackerStory)
}