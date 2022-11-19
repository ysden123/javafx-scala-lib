/*
 * Copyright (c) 2022. StulSoft
 */

package com.stulsoft.lib.utils

import java.util.concurrent.Executors
import scala.concurrent.ExecutionContext

object SystemUtils {
  lazy val executorService = Executors.newFixedThreadPool(10)
  lazy val executionContext = ExecutionContext.fromExecutor(executorService)

  def shutdown(): Unit ={
    executorService.shutdown()
  }
}
