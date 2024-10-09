package org.frgrz.composeui.features.wolf.domain

import org.mongodb.kbson.ObjectId
import io.realm.kotlin.types.RealmObject

class WolfGameRole : RealmObject {
    var id : ObjectId = ObjectId()
    var name : String = ""
    var drawableId: Int = 0
    var isSelected: Boolean = false
}