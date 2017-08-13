package xyz.dokup.regulartimescouter.model

import com.github.gfx.android.orma.annotation.Column
import com.github.gfx.android.orma.annotation.PrimaryKey
import com.github.gfx.android.orma.annotation.Setter
import com.github.gfx.android.orma.annotation.Table

/**
 * Created by e10dokup on 2017/07/04.
 */
@Table
class Status {

    @PrimaryKey(autoincrement = true)
    val id: Long

    @Column
    val power: Int

    @Column
    val regularTime: Long

    @Column
    val averageTime: Long

    @Column
    val bestTime: Long

    @Column
    val worstTime: Long

    constructor(@Setter("id") id: Long,
                @Setter("power") power: Int,
                @Setter("regularTime") regularTime: Long,
                @Setter("averageTime") averageTime: Long,
                @Setter("bestTime") bestTime: Long,
                @Setter("worstTime") worstTime: Long) {
        this.id = id
        this.power = power
        this.regularTime = regularTime
        this.averageTime = averageTime
        this.bestTime = bestTime
        this.worstTime = worstTime
    }
}