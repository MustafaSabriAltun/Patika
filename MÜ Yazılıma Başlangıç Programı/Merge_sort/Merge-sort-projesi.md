[Patika.dev](https://www.patika.dev/tr)

#Soru1
[16,21,11,8,12,22] -> Merge Sort

- a-)Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
- b-)Big-O gösterimini yazınız.

##A-)

                         16 21 11 | 8 12 22

                 16 21 | 11               8 |  12 22

            16 | 21   | 11                   8 |   12 | 22 

                16 21  |  11                8 |  12 22  
                    
                    11 16 21              8 12 22
                        
                           8 11 12 16 21 22


##B-)

**Big-O gösterimini yazınız.**

O(n.logn)