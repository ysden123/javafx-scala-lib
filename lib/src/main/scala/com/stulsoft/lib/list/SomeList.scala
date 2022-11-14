/*
 * Copyright (c) 2022. StulSoft
 */

package com.stulsoft.lib.list

import java.util
import scala.jdk.CollectionConverters._

class SomeList {
  def show(): util.List[String] = {
    List("one", "two", "three").asJava
  }
}
