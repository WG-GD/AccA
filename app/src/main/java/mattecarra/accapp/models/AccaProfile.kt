package mattecarra.accapp.models

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "profiles_table")
data class AccaProfile (

    @PrimaryKey(autoGenerate = true) val uid: Int,
    var profileName: String,
    @Embedded var accConfig: AccConfig
) : Serializable
