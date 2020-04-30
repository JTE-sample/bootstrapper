steps{
  test{
     sh "ls -la"
  }
}  


libraries{
  merge = true // allow individual apps to contribute additional libraries
  git
}
