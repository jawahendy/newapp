import React from 'react';
import {
  Text,
  View,
} from 'react-vr';

export default class StartScreen extends React.Component {
  render() {
    return (
      <View
      style={{
        transform: [
          //{translate: [-0.5, 0.2, -1]},
        ]
      }}
      >
        <Text style={{color: '#fff', fontWeight: 600}}>
          Instructions:
        </Text>
        <Text>
          - Click on Play button.
        </Text>
        <Text>
          - A robot will appear in front of any random window.
        </Text>
        <Text>
          - You have to catch at least 30 robots in 40 seconds to win the game.
        </Text>
      </View>
    )
  }

}
