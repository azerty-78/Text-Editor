package com.kobe.texteditor.ui.Vue.Profile

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.kobe.texteditor.ui.Vue.Uses.MyBottomAppBar


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    navController: NavHostController,
) {



    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Profile") },
            )
        },
        bottomBar = { BottomAppBar{ MyBottomAppBar(navController) } }
    ) {paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ){
            if (true){
                Text("Hello World")
            }else{
                //composant squelette
                SqueletteProfile()
            }
        }
    }
}


@Composable
fun SqueletteProfile() {
    val infiniteTransition = rememberInfiniteTransition(label = "")

//    val iDatasAvailable by remember {
//        mutableSetOf(false)
//    }

    val color by infiniteTransition.animateColor(
        initialValue = MaterialTheme.colorScheme.inverseOnSurface,
        targetValue = MaterialTheme.colorScheme.surfaceVariant,
        animationSpec = infiniteRepeatable(
            animation = tween(1000, easing = FastOutLinearInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = ""
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(10.dp),
            shape = RoundedCornerShape(16.dp),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.padding(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Text(text = "Likes")
                    Box(
                        modifier = Modifier
                            .padding(5.dp)
                            .size(80.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.Blue)
                        ,
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "100k")
                        }
                    }
                }

                Column(
                    modifier = Modifier.padding(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Text(text = "Likes")
                    Box(
                        modifier = Modifier
                            .padding(5.dp)
                            .size(80.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.Blue)
                        ,
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "100k")
                        }
                    }
                }

                Column(
                    modifier = Modifier.padding(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Text(text = "Likes")
                    Box(
                        modifier = Modifier
                            .padding(5.dp)
                            .size(80.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.Blue)
                        ,
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "100k")
                        }
                    }
                }

            }
        }
        Spacer(modifier = Modifier.height(1.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(10.dp),
            shape = RoundedCornerShape(16.dp),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    CustomBox(
                        shape = RoundedCornerShape(8.dp),
                        whidth = 80.dp,
                        height = 20.dp,
                        color = color, {}
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    CustomBox(
                        shape = RoundedCornerShape(8.dp),
                        size = 80.dp,
                        color = color,{}
                    )
                }

                Column(
                    modifier = Modifier.padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    CustomBox(
                        shape = RoundedCornerShape(8.dp),
                        whidth = 80.dp,
                        height = 20.dp,
                        color = color, {}
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    CustomBox(
                        shape = RoundedCornerShape(8.dp),
                        size = 80.dp,
                        color = color,{}
                    )
                }

                Column(
                    modifier = Modifier.padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    CustomBox(
                        shape = RoundedCornerShape(8.dp),
                        whidth = 80.dp,
                        height = 20.dp,
                        color = color, {}
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    CustomBox(
                        shape = RoundedCornerShape(8.dp),
                        size = 80.dp,
                        color = color,{}
                    )
                }

            }
        }


        Spacer(modifier = Modifier.height(1.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(10.dp),
            shape = RoundedCornerShape(16.dp),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.padding(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Text(text = "Likes")
                    Box(
                        modifier = Modifier
                            .padding(5.dp)
                            .size(80.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.Blue)
                        ,
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "100k")
                        }
                    }
                }

                Column(
                    modifier = Modifier.padding(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Text(text = "Likes")
                    Box(
                        modifier = Modifier
                            .padding(5.dp)
                            .size(80.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.Blue)
                        ,
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "100k")
                        }
                    }
                }

                Column(
                    modifier = Modifier.padding(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Text(text = "Likes")
                    Box(
                        modifier = Modifier
                            .padding(5.dp)
                            .size(80.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.Blue)
                        ,
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "100k")
                        }
                    }
                }

            }
        }
        Spacer(modifier = Modifier.height(1.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(10.dp),
            shape = RoundedCornerShape(16.dp),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.padding(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Text(text = "Likes")
                    Box(
                        modifier = Modifier
                            .padding(5.dp)
                            .size(80.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.Blue)
                        ,
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "100k")
                        }
                    }
                }

                Column(
                    modifier = Modifier.padding(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Text(text = "Likes")
                    Box(
                        modifier = Modifier
                            .padding(5.dp)
                            .size(80.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.Blue)
                        ,
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "100k")
                        }
                    }
                }

                Column(
                    modifier = Modifier.padding(5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Text(text = "Likes")
                    Box(
                        modifier = Modifier
                            .padding(5.dp)
                            .size(80.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.Blue)
                        ,
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "100k")
                        }
                    }
                }

            }
        }

    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Prevvv(modifier: Modifier = Modifier) { SqueletteProfile()}


@Composable
fun CustomBox(
    shape: Shape,
    whidth: Dp,
    height: Dp,
    color: Color,
    content : @Composable () -> Unit
) {
    Box(
        modifier = Modifier
            .clip(shape)
            .size(whidth, height)
            .background(color)
    ){
        content()
    }
}
@Composable
fun CustomBox(
    shape: Shape,
    size: Dp,
    color: Color,
    content : @Composable () -> Unit
) {
    Box(
        modifier = Modifier
            .clip(shape)
            .size(size)
            .background(color)
    ){
        content()
    }
}