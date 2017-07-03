package xyz.dokup.regulartimescouter.model

import com.github.gfx.android.orma.annotation.Column
import com.github.gfx.android.orma.annotation.PrimaryKey
import com.github.gfx.android.orma.annotation.Setter
import com.github.gfx.android.orma.annotation.Table
import io.reactivex.annotations.Nullable

/**
 * Created by e10dokup on 2017/07/04.
 */
@Table
class History {

    @PrimaryKey(autoincrement = true)
    val id: Long

    @Column
    val arriveTime: Long

    @Nullable
    @Column
    val leaveTime: Long?

    constructor(@Setter("id") id: Long, @Setter("arriveTime") arriveTime: Long, @Setter("leaveTime") leaveTime: Long?) {
        this.id = id
        this.arriveTime = arriveTime
        this.leaveTime = leaveTime
    }

    constructor(id: Long, arriveTime: Long) {
        this.id = id
        this.arriveTime = arriveTime
        this.leaveTime = null
    }


}