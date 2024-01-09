package dev.gamd.lessons

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

fun main(){
    //val obserabl = Observable.just("RXJava") //for 1 and 2
   /* Основа подписка
   obserabl.subscribe { value->
        println(value)
    }

    RXJava
    */

    /*val observer = object : Observer<String>{
        override fun onSubscribe(d: Disposable) {
            println("Im Subscride")
        }

        override fun onError(e: Throwable) {
            println("Im error")
        }

        override fun onComplete() {
            println("Im complete")
        }

        override fun onNext(t: String) {
            println("Im next: "+t)
        }
    }

    obserabl.subscribe(observer)

    Im Subscride
    Im next: RXJava
    Im complete
    */

    /*val observable2 = Observable.just(1,2,3,4,5,6)
    val observable25 = Observable.just(1,2,3,4,5,6)
    val observable3 = Observable.just("gg", "rr", "ee", "tt")

    observable2.map { it+3 }.subscribe{
        println(it)
    }
    println()

    observable2.filter { it%2==0 }.subscribe{
        println(it)
    }

    println()

    val reObservabl = observable2.flatMap {
        Observable.just(it*5)
    }

    reObservabl.subscribe{
        println(it)
    }

    println()

    val merge = Observable.merge(observable2, observable25)

    merge.subscribe {
        println(it)
    }

    println()

    val combo = Observable.combineLatest(observable3, observable2){ strs, num->
        strs+num
    }

    combo.subscribe{
        println(it)
    }
    4
    5
    6
    7
    8
    9

    2
    4
    6

    5
    10
    15
    20
    25
    30

    1
    2
    3
    4
    5
    6
    1
    2
    3
    4
    5
    6

    tt1
    tt2
    tt3
    tt4
    tt5
    tt6
    */

    /* Будет работать только в контексте андройд
    val observable = Observable.just(1,2,3)

    observable.subscribeOn(Schedulers.io()). observeOn(AndroidSchedulers.mainThread()).subscribe { println(it) }*/
}