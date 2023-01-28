package com.tutorials.eu.favdish.utils

/**
 * This is used to define the constant values that we can use throughout the application.
 */
object Constants {

    const val DISH_TYPE: String = "DishType"
    const val DISH_CATEGORY: String = "DishCategory"
    const val DISH_COOKING_TIME: String = "DishCookingTime"

    const val DISH_IMAGE_SOURCE_LOCAL: String = "Local"
    const val DISH_IMAGE_SOURCE_ONLINE: String = "Online"

    const val EXTRA_DISH_DETAILS: String = "DishDetails"

    const val ALL_ITEMS: String = "All"
    const val FILTER_SELECTION: String = "FilterSelection"

    const val BASE_URL = "https://api.spoonacular.com/"

    const val API_ENDPOINT: String = "recipes/random"

    // API KEY VALUE from the spoonacular console.
    const val API_KEY_VALUE: String = "0411fa307b6f4d9ab19066c9db6070a4"

    // KEY PARAMS
    const val API_KEY: String = "apiKey"
    const val LIMIT_LICENSE: String = "limitLicense"
    const val TAGS: String = "tags"
    const val NUMBER: String = "number"

    // KEY PARAMS VALUES ==> YOU CAN CHANGE AS PER REQUIREMENT FROM HERE TO MAKE THE DIFFERNCE IN THE API RESPONSE.
    const val LIMIT_LICENSE_VALUE: Boolean = true
    const val TAGS_VALUE: String = "vegetarian, dessert"
    const val NUMBER_VALUE: Int = 1

    const val NOTIFICATION_ID = "FavDish_notification_id"
    const val NOTIFICATION_NAME = "FavDish"
    const val NOTIFICATION_CHANNEL = "FavDish_channel_01"
    // END

    fun dishTypes(): ArrayList<String> {
        val list = ArrayList<String>()
        list.add("아침")
        list.add("점심")
        list.add("간식")
        list.add("저녁")
        list.add("샐러드")
        list.add("반찬")
        list.add("디저트")
        list.add("기타")
        return list
    }

    fun dishCategories(): ArrayList<String> {
        val list = ArrayList<String>()
        list.add("피자")
        list.add("BBQ")
        list.add("베이커리")
        list.add("버거")
        list.add("카페")
        list.add("치킨")
        list.add("디저트")
        list.add("음료")
        list.add("핫도그")
        list.add("주스")
        list.add("샌드위치")
        list.add("차&커피")
        list.add("랩")
        list.add("기타")
        return list
    }


    /**
     *  This function will return the Dish Cooking Time list items. The time added is in Minutes.
     */
    fun dishCookTime(): ArrayList<String> {
        val list = ArrayList<String>()
        list.add("10")
        list.add("15")
        list.add("20")
        list.add("30")
        list.add("45")
        list.add("50")
        list.add("60")
        list.add("90")
        list.add("120")
        list.add("150")
        list.add("180")
        return list
    }
}