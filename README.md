# Basic CI sample

This sample project is a part of a ci tutorial.

It's a maven project with checkstyle, findbugs and findbugsecs analyzer.


## How to use it

Clone the projet

`git clone XXXX`

Create a feature branch

`git checkout -b feat/digest-sha-password`

Uncomment SHA digest in file `src/main/java/org/ariadnext/tuto/ci/Digest.java`.

Update test in file  `src/test/java/org/ariadnext/tuto/ci/DigestTest.java`

Run test

`mvn test`

Comment and commit

`git -am "feat: Digest password"`

Push the commit

`git push`

Wait travis pipeline end, and see error.

Update file `src/main/java/org/ariadnext/tuto/ci/Digest.java` to user SHA-256 instead of SHA-1. 

Comment and commit

`git -am "fix: Fix security bug. Use SHA-256 instance of SHA-1"`

Push the commit

`git push`

Go to the project and create a merge request.
