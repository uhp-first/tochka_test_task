package second

object Second extends App{

  val simpleP = TreeNode(1, None, None)
  val simpleQ = TreeNode(1, None, None)
  assert(isSameTree(Some(simpleP), Some(simpleQ)))

  val p = TreeNode(1, Some(TreeNode(2, None, None)), None)
  val q = TreeNode(1, None, Some(TreeNode(2, None, None)))
  assert(!isSameTree(Some(p), Some(q)))

  def isSameTree(p: Option[TreeNode], q: Option[TreeNode]): Boolean = {
    (p, q) match {
      case (Some(p), Some(q)) =>
        p.value == q.value && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
      case (None, None)       => true
      case (None, _)          => false
      case (_, None) => false
    }
  }

}

