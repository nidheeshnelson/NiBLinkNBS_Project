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
  stateListByCountry=(data:string)=>{
    console.log(`in stateListByCountry ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/admin/statebycountry`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify({ countrycode: data }) 
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


  districtAdd=(data:any)=>{
    console.log(`in admin state${data}`)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/admin/adddistrict'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          districtname:data['districtname'],
          countrycode:data['selectedItem1'],
          statecode:data['selectedItem2']
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
  districtList=()=>{
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/admin/alldistrict'
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
  districtListByState=(data:string)=>{
    console.log(`in stateListByCountry ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/admin/districtbystate`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify({ statecode: data }) 
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


  TalukAdd=(data:any)=>{
    console.log(`in admin taluk${data.talukname}`)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/admin/addtaluk'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          thalukname:data.talukname,
          districtcode:data['selectedItem13'],
          countrycode:data['selectedItem11'],
          statecode:data['selectedItem12']
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
  talukList=()=>{
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/admin/alltaluk'
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
  TalukByDistrictStateCountry=(data:any)=>{
    console.log(`in admin state${data}`)
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/admin/talukbydiststatcount'
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body:JSON.stringify({
          districtcode:data['selectedItem13'],
          countrycode:data['selectedItem11'],
          statecode:data['selectedItem12']
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



  jobAdding=(data:any)=>{
    console.log(`in job adding ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/admin/addjob`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify({ jobname: data['jobname'] }) 
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
  jobList=()=>{
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/admin/alljob'
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





