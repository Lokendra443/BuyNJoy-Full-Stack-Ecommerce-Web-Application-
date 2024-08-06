import React, { useEffect } from 'react'
import AddressCard from '../AddressCard/AddressCard'
import { Button } from '@mui/material'
import CartItem from '../Cart/CartItem'
import { useDispatch, useSelector } from 'react-redux'
import { getOrderById } from '../../../State/Order/Action'
import { useLocation } from 'react-router-dom'

const OrderSummary = () => {

  const dispatch = useDispatch();
  const location = useLocation()
  const searchParams = new URLSearchParams(location.search)
  const orderId = searchParams.get("order_id")
  const {order} = useSelector(store=>store)

  useEffect(()=>{
    dispatch(getOrderById())
  },[])


  return (
    <div>
      <div className='p-5 shadow-lg rounded-s-md border'>
        <AddressCard address = {order.order?.shippingAddress}/>

      </div>

      <div className='mt-5'>
        <div className='lg:grid grid-cols-3 relative'>
            <div className='col-span-2'>
            {order.order?.orderItems?.map((item) => <CartItem/> )} 
            </div>

            <div className='px-5 sticky top-0 h-[100vh] mt-5 lg:mt-0'>
            <div className='border p-5'>
                <p className='uppercase font-bold opacity-60 pb-4'>Price Details</p>
                <hr />

                <div className='space-y-3 font-semibold mb-10'>
                    <div className='flex justify-between pt-3 text-black'>
                        <span>Price</span>
                        <span>Rs{order.order?.totalPrice}</span>

                    </div>

                    <div className='flex justify-between pt-3 text-black'>
                        <span>Discount</span>
                        <span className='text-green-600'>Rs{order.order?.discounte}</span>

                    </div>


                    <div className='flex justify-between pt-3 text-black'>
                        <span>Delivery Charge</span>
                        <span className='text-green-600'>Free</span>

                    </div>

                    <div className='flex justify-between pt-3 text-black'>
                        <span>Total Amount</span>
                        <span className='text-green-600'>Rs{order.order?.totalDiscountedPrice}</span>

                    </div>

                   



                </div>

                <Button className='w-full'  variant='contained' sx={{px:"2.5rem", py:".7rem"}}>
                        Checkout
                </Button>

            </div>

            </div>
        
        </div>

        
        
    </div>
      
    </div>
  )
}

export default OrderSummary
