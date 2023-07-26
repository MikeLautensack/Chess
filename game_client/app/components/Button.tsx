'use client'

import { ButtonProps } from '../types/buttontypes'

const Button = ({ children, ...props }: ButtonProps) => {
    return (
      <button
        {...props}
      >
        {children}
      </button>
    )
}

export default Button