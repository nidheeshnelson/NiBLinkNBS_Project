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
  talukListByDistrict=(data:string)=>{
    console.log(`in stateListByCountry ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/admin/talukbydistrict`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify({ districtcode: data }) 
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


  commissionAdding=(data:any)=>{
    console.log(`in commission adding ${data.commission}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/admin/addcommission`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify({ commissionpersentage: data.commission }) 
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
  commissionListing=()=>{
    return new Promise((resolve,reject)=>{
      let url='http://localhost:8080/admin/allcommission'
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

  showAdminName=(data:any)=>{
    console.log(`in show admin ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/profile/showadminname`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(data) 
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
  editAdminName=(data:any)=>{
    console.log(`in edit admin name ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/profile/editadminname`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(data) 
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
  showExpertName=(data:any)=>{
    console.log(`in show expert name ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/profile/showexpertname`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(data) 
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
  editExpertName=(data:any)=>{
    console.log(`in edit expert name ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/profile/editexpertname`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(data) 
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
  showCustomerName=(data:any)=>{
    console.log(`in show customer name ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/profile/showcustomername`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(data) 
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
  editCustomerName=(data:any)=>{
    console.log(`in edit customer name ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/profile/editcustomername`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(data) 
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
  showAddress=(data:any)=>{
    console.log(`in show address ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/profile/showaddress`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(data) 
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
  editAddress=(data:any)=>{
    console.log(`in edit address ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/profile/editaddress`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(data) 
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
  showBanking=(data:any)=>{
    console.log(`in show banking ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/profile/showbanking`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(data) 
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
  editBanking=(data:any)=>{
    console.log(`in edit banking ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/profile/editbanking`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(data) 
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
  showIdentity=(data:any)=>{
    console.log(`in show identity ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/profile/showidentity`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(data) 
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
  editIdentity=(data:any)=>{
    console.log(`in edit identity ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/profile/editidentity`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(data) 
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
  showPersonal=(data:any)=>{
    console.log(`in show personal ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/profile/showpersonal`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(data) 
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
  editPersonal=(data:any)=>{
    console.log(`in edit personal ${data}`)
    return new Promise((resolve,reject)=>{
      let url=`http://localhost:8080/profile/editpersonal`
      let encode={
        method:"POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(data) 
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





