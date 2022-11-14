/*
 * Copyright (c) 2022. StulSoft
 */

package com.stulsoft.lib.math

trait MathService {
  def show(): String
}

object MathService {
  def service(): MathService = MathServiceImpl()
}
