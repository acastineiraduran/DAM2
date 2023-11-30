package com.dam.teoriacompose_v2

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.dam.teoriacompose_v2.ui.theme.TeoriaCompose_v2Theme
import com.example.pruebaborrar2.datos.SampleData

@Composable
fun Conversation(messages: List<Mensaje>) {
    LazyColumn {
        items(messages) { message ->
            MensajesVarios(message)
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    TeoriaCompose_v2Theme {
        Conversation(SampleData.conversationSample)
    }
}
