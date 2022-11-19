/*
 * Copyright (c) 2022. StulSoft
 */

package com.stulsoft.lib.async

import com.stulsoft.lib.utils.SystemUtils

import java.util.function.Consumer
import scala.concurrent.{ExecutionContext, Future, Promise}
import scala.util.{Failure, Success}

class AsyncService {

  def show(consumer: Consumer[String]): Unit = {
    val executionContext: ExecutionContext = SystemUtils.executionContext

    val future = Future {
      Thread.sleep(1000)
      Success("This is from AsyncService::show")
    }(executionContext)

    future.onComplete {
      case Success(theResult) => consumer.accept(theResult.value)
      case Failure(exception) => consumer.accept("Error: " + exception.getMessage)
    }(executionContext)
  }
}
