package faust

import scala.meta._
import scala.meta.contrib._

class ICacheMiddleAllocate extends Feature {
  extendWithInit (init"InstructionCache(usedParams, nastiParams, coreParams.xlen)") insert (init"HasMiddleAllocate") in (q"class Tile") register
}