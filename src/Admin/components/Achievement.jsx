import { Button, Card, CardContent, styled, Typography } from '@mui/material'
import React from 'react'

const TrignleImg = styled("img")({
    right:0,
    bottom:0,
    height:170,
    position:"absolute"
})

const TrophyImg = styled("img")({
    right:36,
    bottom:20,
    height:98,
    position:"absolute"
})


const Achievement = () => {
  return (
    <Card className='' sx={{position:"relative", bgcolor:"#242B2E", color:"white"}}>
        <CardContent>
            <Typography variant='h6' sx={{letterSpacing:".25px"}}>
                Shop with Lenn
            </Typography>
            <Typography variant='body2'>
                Congratulations
            </Typography>
            <Typography variant='h5' sx={{my:3.1}}>
                420.8k
            </Typography>

            <Button size='small' variant='contained'>View Sales</Button>

            <TrignleImg src=''></TrignleImg>
            <TrophyImg src='https://media.istockphoto.com/id/1168757141/vector/gold-trophy-with-the-name-plate-of-the-winner-of-the-competition.jpg?s=612x612&w=0&k=20&c=ljsP4p0yuJnh4f5jE2VwXfjs96CC0x4zj8CHUoMo39E='/>
        </CardContent>
    </Card>
  )
}

export default Achievement
