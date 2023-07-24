'use client'

import { ButtonProps } from '../types/buttontypes'

const Button = ({ buttonStyles, children }: ButtonProps) => {
    return (
      <button 
        style={{
          width: buttonStyles.width,
          height: buttonStyles.height,
          color: buttonStyles.color,
          backgroundColor: buttonStyles.bgcolor,
          margin: buttonStyles.margin,
          padding: buttonStyles.padding,
          border: buttonStyles.border,
          borderRadius: buttonStyles.borderRadius,
          fontSize: buttonStyles.fontSize,
          fontWeight: buttonStyles.fontWeight
        }}>
        {children}
      </button>
    )
}

export default Button