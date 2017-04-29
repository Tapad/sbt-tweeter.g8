package $organization$

import scala.util.Try

trait TweeterService {
  def post(tweet: String): Try[_]
}
