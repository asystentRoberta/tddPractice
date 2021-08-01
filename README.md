# tdd-practices

A walkthrough of the examples given in "Test Driven Development by Example" by Kent Beck with Java

[Read more below about this repo](#walk-through)

[Read Summary of Chapters](#summary-of-chapters)

![](http://bohdziewicz.com.pl/imagesForGit/letsPractice.jpg)

#### Walk through
## _General comments_
:point_right: _Notes after first chapter:_

After few first commits I found own way to work with this book. For Chapter I prepared a branch and from this branch you can find sub-branch for book's subsection.
The best way to work with this repo is playback all comits and wath how the code was changed. 
I can recomended great addon for github for this. Take a look: [git-playbck](https://github.com/jianli/git-playback =10).
With this addon you can:
```sh
cd /repo
git playback README.MD
```
and then press the following keys to navigate
* `r`ewind
* `p`lay
* `b`ack one commit
* `f`orward one commit
* `Ctrl` + `n`ext line
* `Ctrl` + `p`revious line
* `q`uit

It is brilliant!

----
:watch: Now I'm going to read Chapter2 (Pythons examples). Let's play with Python ![](http://bohdziewicz.com.pl/imagesForGit/python_icon.png)
----


## *Summary of Chapters*
### _Part I: 17 submodules_
The first part walks through an example of creating a way to manage money with different currencies (in Java).  Beck starts by creating a written list of things that need to be tested based on the functionality required.

In the money example, this comes down to the following:

$5 + 10 CHF = $10 if rate is 2:1

This is where we want to end up, but it's way to big of a step.  So, the test is broken down into smaller and smaller steps that we can actually write tests for and code for.

I won't got into the details here (that's why you should read the book).  Ultimately, to get to this final functionality, we end up with a collection of 30 or so tests (sorry, I didn't actually count them).  This may sound like a lot, but it turns out to be worthwhile.  Throughout the process, the focus is getting small pieces of functionality into the system (even if it is just verifying equality).

The result of the continuous red/green/refactor process is a design the evolves based on the actual needs of the system rather that what we think the system might need.

