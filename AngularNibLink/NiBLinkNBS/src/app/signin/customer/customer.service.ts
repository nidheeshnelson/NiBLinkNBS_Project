import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  constructor() { }

  findShiftByDate=(data:any)=>{
    console.log(`in admin country${data}`)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/expert/findjobshiftbydate'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          thalukid:data.thalukid,
          jobid:data.jobid,
          jobdate:data.jobdate
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
  findShift=(data:any)=>{
    console.log(`in admin country${data}`)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/expert/findJobShifts'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          thalukid:data.thalukid,
          jobdate:data.jobdate
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
