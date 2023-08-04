fun main(){

    var contact = mutableMapOf<String,String>()

    while (true){
        println("یکی از گزینه ها را انتخاب کنید")
        println("[1] اضافه کردن مخاطب ")
        println("[2]   مشاهده مخاطبین ")
        println("[3] حذف کاربر از مخاطبین ")
        println("[0]   خروج از برنامه ")
        var click = readLine()!!.toInt()

        when(click){

            1->{
                println("نام را وارد نمایید")
                var name = readLine()?.trim() ?: continue
                println("شماره را وارد نمایید")
                var phoneNumber = readLine()?.trim() ?:continue
                contact[name] = phoneNumber
                println("مخاطب با موفقیت اضافه شد")
                println("=========================")
            }

            2->{
                for ((name , phoneNumber) in contact){
                    println("$name : $phoneNumber")
                    println("=========================")
                }
                if (contact.isEmpty() == true){
                    println("لیست مخاطبین خالی میباشد !!")
                    println("=========================")
                }
            }

            3->{
                println("نام مخاطب جهت حذف از لیست مخاطبین")
                var name = readLine()?.trim() ?: continue
                if (contact.containsKey(name.lowercase())){
                    contact.remove(name)
                    println("$name  با موفقیت حذف گردید  ")
                    println("=========================")
                }else{
                    println("مخاطبی با این نام ذخیره نمیباشد")
                    println("=========================")
                }
            }

            0->{
                println("برنامه به پایان رسید !!")
                println("=========================")
                return
            }

            else ->{
                println("عدد وارد شده نامعتبر یکبار دیگر تلاش کنید")
                println("=========================")
            }

        }


    }


}