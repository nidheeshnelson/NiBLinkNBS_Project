import { Injectable } from '@angular/core';
@Injectable({
  providedIn: 'root'
})
export class AdminService {
  constructor() { }
  countryAdd=(data:any)=>{
    console.log(`in admin country${data}`)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/admin/addcountry'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          countryname:data['countryname']
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

  countryList=()=>{
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/admin/allcountry'
      let encode={
         headers:{'Content-Type': 'application/json'},
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

  stateAdd=(data:any)=>{
    console.log(`in admin state${data}`)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/admin/addstate'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          state:data['statename'],
          countrycode:data['selectedItem']
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
  
  

  stateList=()=>{
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/admin/allstate'
      let encode={
         headers:{'Content-Type': 'application/json'},
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
