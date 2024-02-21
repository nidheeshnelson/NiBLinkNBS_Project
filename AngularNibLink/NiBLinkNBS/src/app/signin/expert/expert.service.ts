import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ExpertService {

  constructor() { }

  paymentDetails=(data:any)=>{
    console.log(`in expert payment details${data}`)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/expert/addpaymentdetails'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          paymentperhour:data.paymentperhour,
          commissionid:data.commissionid,
          paymentid:data.paymentid
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

  createShift=(data:any)=>{
    console.log(`in expert payment details${data}`)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/expert/createshift'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          expertname:data.expertname,
          shiftdate:data.shiftdate,
          shifttime:data.shifttime,
          expertcontact:data.contact,
          thalukcode:data.thalukcode,
          jobcode:data.jobcode,
          expertid:data.expertid
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
  findShiftsByExpert=(data:any)=>{
    console.log(`in expert find shifts by expert${data}`)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/expert/findshiftbyexpert'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          expertid:data
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
  findShiftRequestsByShiftId=(data:any)=>{
    console.log(`in expert find shifts by expert${data}`)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/expert/findshiftrequests'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          shiftid:data
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
  acceptRequest=(request:any)=>{
    console.log(`in expert accept request by expert${request}`)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/expert/requestaccept'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          shiftid:request.shiftid,
          customerid:request.customerid
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
  startWork=(item:any)=>{
    console.log(`in expert accept request by expert${item}`)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/expert/shiftstarts'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          shiftid:item.generatedshiftid
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
  workFinished=(item:any)=>{
    console.log(`in expert accept request by expert${item}`)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/expert/shiftfinished'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          shiftid:item.generatedshiftid,
          hoursforwork:item.hoursforwork
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
