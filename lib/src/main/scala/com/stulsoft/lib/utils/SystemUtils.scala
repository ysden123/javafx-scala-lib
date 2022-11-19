/*
 * Copyright (c) 2022. StulSoft
 */

package com.stulsoft.lib.utils

import java.util.concurrent.{ExecutorService, Executors}
import scala.concurrent.{ExecutionContext, ExecutionContextExecutor}

object SystemUtils {
  lazy val executorService: ExecutorService = Executors.newFixedThreadPool(10)
  lazy val executionContext: ExecutionContextExecutor = ExecutionContext.fromExecutor(executorService)

  def shutdown(): Unit ={
    executorService.shutdown()
  }
}
