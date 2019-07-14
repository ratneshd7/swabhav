using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace welcome
{
    class ArrayBasic
    {
        int[] value = new int[5] {10,20,30,40,50 };
       public void printArray()
        {
            for(int i=0;i<value.Length;i++)
                Console.WriteLine(  value[i]);
        }
    }
}
