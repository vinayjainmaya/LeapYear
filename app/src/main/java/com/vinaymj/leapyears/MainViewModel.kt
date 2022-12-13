package com.vinaymj.leapyears

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    /**
     * method to check year is leap year or not.
     *
     * @param year, year in integer
     * @return true if leap year else false
     */
    fun isLeapYear(year: Int) : Boolean {
        return if (year % 4 == 0) {
            if(year % 100 == 0) {
                (year % 400 == 0)
            } else true
        } else false
    }

}