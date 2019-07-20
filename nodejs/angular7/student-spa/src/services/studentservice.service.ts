import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable()
export class StudentService
{
    url:string="http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students";
    constructor(private http:HttpClient){
      console.log("Inside service")
    }
    getStudents():Promise<any>
    {
        return new Promise((resolve,reject)=>
        {
            this.http.get(this.url,{responseType: 'json'})
            .toPromise()
            .then((response)=>{
                console.log(response);
                resolve(response);
            })
            .catch((err)=>{
                console.log(err)
                reject(err)
            })
        })
    }
    addStudents(data):Promise<any>
    {
        return new Promise((resolve,reject)=>
        {
            this.http.post(this.url,data,{responseType: 'json'})
            .toPromise()
            .then((response)=>{
               //console.log(response);
                resolve(response);
            })
            .catch((err)=>{
               // console.log(err)
                reject(err)
            })
        })
    }

    deleteStudents(data):Promise<any>
    {
        return new Promise((resolve,reject)=>
        {
            this.http.delete(this.url+"/"+data,{responseType: 'json'})
            .toPromise()
            .then((response)=>{
               //console.log(response);
                resolve(response);
            })
            .catch((err)=>{
               // console.log(err)
                reject(err)
            })
        })
    }
    updateStudents(id,data):Promise<any>
    {
        return new Promise((resolve,reject)=>
        {
            this.http.put(this.url+"/"+id,data,{responseType: 'json'})
            .toPromise()
            .then((response)=>{
               //console.log(response);
                resolve(response);
            })
            .catch((err)=>{
               // console.log(err)
                reject(err)
            })
        })
    }
  }
