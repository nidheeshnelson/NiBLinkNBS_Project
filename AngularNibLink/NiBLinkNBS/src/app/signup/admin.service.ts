import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor() { }
  signUpAdmin=(data:any)=>{
    console.log(`in admin signup${data}`)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/log/sup'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          username:data['user'],
          password:data['pass'],
          email:data['email'],
          phone:data['phone'],
          status:1
        })
      }
      fetch(url,encode)
      .then(async(response)=>{
        response=await response.json()
        console.log(`response from spring add data${JSON.stringify(response)}`)
        resolve(response)
      })
      .catch((error)=>{
        reject(error)
      })
    })
  }
}
