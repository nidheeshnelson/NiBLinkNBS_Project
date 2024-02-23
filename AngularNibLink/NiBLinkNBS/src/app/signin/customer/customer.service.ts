import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  constructor() { }

  findShiftByDate=(data:any)=>{
    console.log("in find shift by date",data.thalukid,data.jobid,data.jobdate)
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
        console.log(`response from findShiftByDate data${JSON.stringify(response)}`)
        resolve(response)
      })
      .catch((error)=>{
        reject(error)
      })
    })
  }
  findShift=(data:any)=>{
    console.log("in find shift by date",data.thalukid,data.jobid)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/expert/findjobshift'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          thalukid:data.thalukid,
          jobid:data.jobid
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
  requestShift=(data:any)=>{
    console.log("in find shift by date",data.shiftid,data.shiftdate)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/customer/requestshift'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          shiftid:data.shiftid,
          shiftdate:data.shiftdate,
          shifttime:data.shifttime,
          expertid:data.expertid,
          customerid:data.customerid,
          address:data.address,
          landmark:data.landmark,
          customername:data.customername,
          customercontact:data.customercontact
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
  totalAmount=(data:string)=>{
    console.log("in total amount service",data)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/paymentgateway/amountpayable'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          customerid:data
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
  cardPay=(data:any)=>{
    console.log("in total amount service",data)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/paymentgateway/cardpay'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          payeeid:data,
          shiftid:data,
          debitcardnumber:data,
          expirationdate:data,
          cvc:data,
          password:data,
          amountget:data
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
  netBankPay=(data:any)=>{
    console.log("in total amount service",data)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/paymentgateway/netbank'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          payeeid:data,
          shiftid:data,
          netbankingid:data,
          password:data,
          amountget:data
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
  upiPay=(data:any)=>{
    console.log("in total amount service",data)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/paymentgateway/upipay'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          payeeid:data,
          shiftid:data,
          upiid:data,
          password:data,
          amountget:data
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
  transactionHistory=(data:any)=>{
    console.log("in total amount service",data)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/paymentgateway/amountpayable'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          customerid:data
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
