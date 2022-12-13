package com.vinaymj.leapyears

import org.junit.Assert
import org.junit.Before
import org.junit.Test


class MainViewModelTest {

    private lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun `year evenly divisible by 4`() {
        Assert.assertTrue(viewModel.isLeapYear(2008))
    }

    @Test
    fun `year not evenly divisible by 4`() {
        Assert.assertFalse(viewModel.isLeapYear(2017))
    }

    @Test
    fun `year evenly divisible by 400`() {
        Assert.assertTrue(viewModel.isLeapYear(2000))
    }

    @Test
    fun `year not evenly divisible by 400`() {
        Assert.assertFalse(viewModel.isLeapYear(1900))
    }

    @Test
    fun `year evenly divisible by 4 but not evenly divisible by 100`() {
        Assert.assertTrue(viewModel.isLeapYear(2012))
    }

    @Test
    fun `year evenly divisible by 100 but not evenly divisible by 400`() {
        Assert.assertFalse(viewModel.isLeapYear(1700))
    }

    @Test
    fun `year evenly divisible by 100 also evenly divisible by 400`() {
        Assert.assertTrue(viewModel.isLeapYear(2400))
    }
}