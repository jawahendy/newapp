import React from 'react';
import {
  Text,
  View,
} from 'react-vr';

export default class LostScreen extends React.Component {
  render() {
    return (
      <View>
        <Text style={{color: 'red', fontWeight: 600, textAlign: 'center'}}>
          Lost cheer up try again
        </Text>
      </View>
    )
  }

}